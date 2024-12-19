//Jonathan Graydon
//Bouncing Circle
//This program is like the last but with a circle



// Define a class to store the ball's attributes
class Ball {
  float x, y;       // Position of the ball (center)
  float xSpeed, ySpeed;  // Speed (velocity) in both directions
  float radius = 25;   // Radius of the ball
  
  // Constructor to initialize the ball's properties
  Ball(float startX, float startY, float startXSpeed, float startYSpeed) {
    x = startX;
    y = startY;
    xSpeed = startXSpeed;
    ySpeed = startYSpeed;
  }
  
  // Method to update the ball's position and handle bouncing
  void update() {
    // Move the ball
    x += xSpeed;
    y += ySpeed;
    
    // Bounce off the left and right edges
    if (x + radius > width || x - radius < 0) {
      xSpeed = -xSpeed;  // Reverse the x-speed if ball goes out of bounds
      if (x + radius > width) {
        x = width - radius;  // Prevent the ball from clipping out
      } else if (x - radius < 0) {
        x = radius;  // Prevent the ball from clipping out on the left
      }
    }
    
    // Bounce off the top and bottom edges
    if (y + radius > height || y - radius < 0) {
      ySpeed = -ySpeed;  // Reverse the y-speed if ball goes out of bounds
      if (y + radius > height) {
        y = height - radius;  // Prevent the ball from clipping out
      } else if (y - radius < 0) {
        y = radius;  // Prevent the ball from clipping out on the top
      }
    }
  }
  
  // Method to display the ball
  void display() {
    ellipse(x, y, radius * 2, radius * 2);  // Draw the ball (ellipse with diameter)
  }
}

// Declare a ball object
Ball ball;

void setup() {
  size(600, 601); // Set window size
  // Initialize ball with starting position and speed in both directions
  ball = new Ball(300, 300, 3, 3);
}

void draw() {
  background(200);  // Clear the screen with a gray background
  
  ball.update();  // Update the ball's position and handle bouncing
  ball.display(); // Display the ball
}
