void setup(){
  size(500,500);
}
void draw(){
  float y = 0.0f;
  for(int x = 0; x<500; x+=5){
    y = (-1 * (3 * (x * x * x))/87500) + ((58 * (x * x))/2625) - ((302 * x)/105) + 200;
      fill(255, 255, 255);
    rect(x, 500-y, 10, 10);
  }
}
