import FlightTakeoffIcon from '@mui/icons-material/FlightTakeoff';
import { Stack, Typography } from '@mui/material';
import { Link } from 'react-router-dom';

const styles = {
  largeIcon: {
    width: '7.5vw',
    height: '7.5vw',
  },
  largeText: {
    fontSize: '6vw',
  },
};

const Header = () => {
  return (
    <Link to='/' underline='none'>
      <Stack direction='row'>
        <FlightTakeoffIcon style={styles.largeIcon} />
        <Typography style={styles.largeText}>Travel</Typography>
      </Stack>
    </Link>
  );
};

export default Header;
