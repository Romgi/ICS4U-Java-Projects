//Jonathan Graydon
//Drawing a Clock
//This program will draw a clock with 60 evenly spaced tick marks using trig and radians

void setup() {
  size(500, 500);
  background(255);
  
  // Draw outer circle of the clock
  noFill();
  stroke(0);
  strokeWeight(2);
  ellipse(width/2, height/2, 450, 450);  // diameter is 450, radius is 225
  
  // Draw 60 tick marks around the clock
  strokeWeight(2);
  float centerX = width / 2.0;
  float centerY = height / 2.0;
  float clockRadius = 225;
  float tickLength = 15;
  
  for (int i = 0; i < 60; i++) {
    float angle = TWO_PI * i / 60.0;
    
    float x2 = centerX + cos(angle) * clockRadius;
    float y2 = centerY + sin(angle) * clockRadius;

    float x1 = centerX + cos(angle) * (clockRadius - tickLength);
    float y1 = centerY + sin(angle) * (clockRadius - tickLength);
    
    line(x1, y1, x2, y2);
  }
}
