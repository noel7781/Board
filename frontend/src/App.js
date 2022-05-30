import './App.css';
import Home from './screens/Home';
import Header from './components/Header';
import Sidebar from './components/Sidebar';
import { Route, Routes } from 'react-router-dom';
import { List, Stack } from '@mui/material';
import { Divider } from '@mui/material';
import Korea from './components/caterogires/Korea';
import Board from './components/Board';
import Austrailia from './components/caterogires/Austrailia';
import Asia from './components/caterogires/Asia';
import Europe from './components/caterogires/Europe';
import NA from './components/caterogires/NA';
import SA from './components/caterogires/SA';
import Africa from './components/caterogires/Africa';

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
          <Route path='/korea' element={<Board kind={Korea} />} />
          <Route path='/asia' element={<Board kind={Asia} />} />
          <Route path='/europe' element={<Board kind={Europe} />} />
          <Route path='/north-america' element={<Board kind={NA} />} />
          <Route path='/south-america' element={<Board kind={SA} />} />
          <Route path='/austrailia' element={<Board kind={Austrailia} />} />
          <Route path='/africa-me' element={<Board kind={Africa} />} />
        </Routes>
      </Stack>
    </List>
  );
};

export default App;
