//Jonathan Graydon
//Many Random Particles
//This program will create 15 randomly moving particles and stores them in a class

// Particle class to store position and movement attributes
class Particle {
  float posX, posY;  // Position of the particle
  float directionX, directionY;  // Direction of movement
 
  Particle(float x, float y) {
    posX = x;
    posY = y;
  }
  void move() {
    directionX = random(-5, 5);
    directionY = random(-5, 5);
    
    // Update the position
    posX += directionX;
    posY += directionY;
  }
  
  // Method to display the particle
  void display() {
    ellipse(posX, posY, 50, 50); 
  }
}

Particle[] particles;  // Array to store the 15 particles

void setup() {
  size(500, 500);
  background(255);
  
  particles = new Particle[15];  // Create an array to hold 15 particles
  
  for (int i = 0; i < particles.length; i++) {
    float randomX = random(width);  // Random starting position in X
    float randomY = random(height); // Random starting position in Y
    particles[i] = new Particle(randomX, randomY);
  }
}

void draw() {
  background(255);
  
  // Update and display each particle
  for (int i = 0; i < particles.length; i++) {
    particles[i].move();    // Move the particle
    particles[i].display(); // Display the particle
  }
}
