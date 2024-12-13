//Jonathan Graydon
//Random Target Program
//This program will draw a randomly coloured target with 10 colours

void setup() {
  size(500, 500);
  background(255);
  
  for (int i = 10; i > 0; i--) {
    float colourR = random(255);
    float colourG = random(255);
    float colourB = random(255);
    fill(colourR, colourG, colourB);
    noStroke();
    
    float diameter = i * 20;
    circle(width/2, height/2, diameter);
  }
}
