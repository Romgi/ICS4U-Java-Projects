//Jonathan Graydon
//Many Coloured Particles
//This program will make 15 randomly colour changing particles
//This program uses many methods and an external class to store the particles


// Particle class to store position, movement, and color attributes
class Particle {
  float posX, posY;  // Position of the particle
  float directionX, directionY;  // Direction of movement
  color particleColor;  // Color of the particle
  
  // Constructor to initialize the position and color
  Particle(float x, float y) {
    posX = x;
    posY = y;
    
    // Initialize with a random color
    particleColor = color(random(255), random(255), random(255));
  }
  
  // Method to update the position and change the color
  void move() {
    directionX = random(-5, 5);  // Random movement in X direction
    directionY = random(-5, 5);  // Random movement in Y direction
    
    // Update the position
    posX += directionX;
    posY += directionY;
    
    // Continuously change the color by randomizing RGB values
    particleColor = color(random(255), random(255), random(255));
  }
  
  // Method to display the particle with its color
  void display() {
    fill(particleColor);  // Set the fill color to the particle's color
    ellipse(posX, posY, 50, 50);  // Draw the particle as a circle with a 50x50 size
  }
}

Particle[] particles;  // Array to store the 15 particles

void setup() {
  size(500, 500);
  background(255);
  
  particles = new Particle[15];  // Create an array to hold 15 particles
  
  // Initialize each particle with random positions
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
    particles[i].move();    // Move the particle and change color
    particles[i].display(); // Display the particle with the updated color
  }
}
