void setup() {
  size(600,600); 
  noStroke();
  rectMode(CENTER);
}

void draw() {
  background(51); 
  fill(255, 204);
  rect(width/2, height/2, mouseY/2+10, mouseY/2+10);
  fill(255, 204);
  rect(mouseX, mouseY, mouseX/2+10, mouseY/2+10);
  fill(255,204);
  
}
