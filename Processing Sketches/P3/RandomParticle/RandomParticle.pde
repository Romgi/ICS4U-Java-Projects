//Jonathan Graydon
//Random Movement
//This file will make a circle move around the screen randomly between 0 and 5 units each frame

float posX, posY;  // Variables to store the current position of the circle

void setup(){
  size(500,500);
  background(255);
  
  posX = width / 2;  // Starting position in the center of the screen
  posY = height / 2;
}

void draw(){
  background(255);
  
  // Randomly move the circle in both X and Y directions
  float directionX = random(-5, 5);  // Random movement between -5 and 5 units
  float directionY = random(-5, 5);  // Random movement between -5 and 5 units
  
  // Update the position of the circle
  posX += directionX;
  posY += directionY;
  
  // Draw the circle at the new position
  ellipse(posX, posY, 50, 50);  // 50x50 is the size of the circle
}
