import './App.css';
import Home from './screens/Home';
import Header from './components/Header';
import Sidebar from './components/Sidebar';
import { Route, Routes } from 'react-router-dom';
import { List, Stack } from '@mui/material';
import { Grid, Container, Divider } from '@mui/material';

const App = () => {
  return (
    <List>
      <Stack justifyContent='center' alignItems='center'>
        <Header />
      </Stack>
      <Divider />
      <Stack direction='row'>
        <Sidebar></Sidebar>
        <Routes>
          <Route path='/' element={<Home />} />
        </Routes>
      </Stack>
    </List>
  );
};

export default App;
