import './App.css';
import DataTable from './Table';
import { Box, Button} from '@material-ui/core';
import Grid from '@material-ui/core/Grid';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
      <div className="App-header"><h1>PRE INSTA KART</h1></div>
      <div className="container">
        <Box sx={{ flexGrow: 1 }}>
          <Grid item xs={12}>
        <div className="button">      
      <Button
  variant="contained"
  component="label"
>
  Upload File
  <input
    type="file"
    hidden
  />
</Button></div></Grid>
</Box>
<Grid item xs={12}>
<Box>
      <DataTable className="container"/></Box>
      </Grid>
      </div>
      
    </div>
  );
}

export default App;
