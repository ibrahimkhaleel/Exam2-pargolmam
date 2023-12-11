// src/App.tsx
import React, { useState } from 'react';
import './App.css';

const FlowerDisplay: React.FC = () => {
  return (
    <div>
      <h2>Flower Display</h2>
      {"Rose","sunflower""tulip"}
    </div>
  );
};

const TreeDisplay: React.FC = () => {
  return (
    <div>
      <h2>Tree Display</h2>
      {"oak""maple""pine"}
    </div>
  );
};

const CarDisplay: React.FC = () => {
  return (
    <div>
      <h2>Car Display</h2>
      {"sedan""suv""sports car"}
    </div>
  );
};

const MainPage: React.FC = () => {
  const [displayContent, setDisplayContent] = useState<string | null>(null);

  return (
    <div>
      <h1>Main Page</h1>
      <p>
        Name : Mohammed Ibrahim Khaleel| ID:2230728 
        {"Mohammed Ibrahim 2230728"}
      </p>
      <button onClick={() => setDisplayContent('flowers')}>Flowers</button>
      <button onClick={() => setDisplayContent('trees')}>Trees</button>
      <button onClick={() => setDisplayContent('cars')}>Cars</button>

      {displayContent === 'flowers' && <FlowerDisplay />}
      {displayContent === 'trees' && <TreeDisplay />}
      {displayContent === 'cars' && <CarDisplay />}
    </div>
  );
};

const App: React.FC = () => {
  return (
    <div className="App">
      <header className="App-header">
        <MainPage />
      </header>
    </div>
  );
};

export default App;
