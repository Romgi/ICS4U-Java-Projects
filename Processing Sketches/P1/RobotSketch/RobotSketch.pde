PFont f;                           // STEP 1 Declare PFont variable

void setup() {
  size(500,500);
  
}

void draw() {
  fill(0, 0, 255);
  rect(150, 150, 200, 80);
  
  fill(255, 100, 0);
  rect(205, 230, 80, 180);
  
  for (int i = 0; i<2; i++){
    fill(0, 255, 255);
    rect(75 + 210 * i, 250, 130, 10);
    
    fill(100,100,100);
    rect(217 + 40 * i, 410, 15, 40);
    
    fill(255,255,255);
    rect(200 + 60 * i, 160, 30, 10);
  }
  fill(255,255,255);
  rect(210, 200, 70, 15);
}
