PFont f;

String typing = "";
String saved = "";

void setup() {
  size(300, 200);
  f = createFont("Arial", 16);
}

void draw() {
  background(255);
  int indent = 25;

  textFont(f);
  fill(0);

  text("Type Here, then hit ENTER", indent, 30);
  text(typing, indent, 70);
  text(saved, indent, 100);
}

void keyPressed() {
  if (key == '\n') {
    saved = typing;
    typing = "";
  }
  else {
    typing = typing + key;
  }
}
