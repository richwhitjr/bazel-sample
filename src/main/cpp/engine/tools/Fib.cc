int Fibonacci(int x) {
  if (x < 2){
    return x;
  }      
  return (Fibonacci (x - 1) + Fibonacci (x - 2));
}