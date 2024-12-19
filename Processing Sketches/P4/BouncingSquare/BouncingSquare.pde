//Jonathan Graydon
//Bouncing Square
//This program will make a square bounce around on the screen

// Define a class to store the square's attributes
class Square {
  float x, y;       // Position of the square
  float xSpeed, ySpeed;  // Speed (velocity) in both directions
  float size = 50;   // Size of the square
  
  // Constructor to initialize the square's properties
  Square(float startX, float startY, float startXSpeed, float startYSpeed) {
    x = startX;
    y = startY;
    xSpeed = startXSpeed;
    ySpeed = startYSpeed;
  }
  
  // Method to update the square's position and handle bouncing
  void update() {
    // Move the square
    x += xSpeed;
    y += ySpeed;
    
    // Bounce off the left and right edges
    if (x + size > width || x < 0) {
      xSpeed = -xSpeed;  // Reverse the x-speed if square goes out of bounds
      if (x + size > width) {
        x = width - size;  // Prevent the square from clipping out
      } else if (x < 0) {
        x = 0;  // Prevent the square from clipping out on the left
      }
    }
    
    // Bounce off the top and bottom edges
    if (y + size > height || y < 0) {
      ySpeed = -ySpeed;  // Reverse the y-speed if square goes out of bounds
      if (y + size > height) {
        y = height - size;  // Prevent the square from clipping out
      } else if (y < 0) {
        y = 0;  // Prevent the square from clipping out on the top
      }
    }
  }
  
  // Method to display the square
  void display() {
    rect(x, y, size, size);  // Draw the square with a width and height of 50
  }
}

// Declare a square object
Square square;

void setup() {
  size(600, 601); // Set window size
  // Initialize square with starting position and speed in both directions
  square = new Square(300, 300, 3, 3);
}

void draw() {
  background(200);  // Clear the screen with a gray background
  
  square.update();  // Update the square's position and handle bouncing
  square.display(); // Display the square
}
