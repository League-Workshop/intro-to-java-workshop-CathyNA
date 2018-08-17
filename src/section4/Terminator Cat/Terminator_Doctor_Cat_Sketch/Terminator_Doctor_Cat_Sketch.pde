int x=265;
int y=213;
int acceleration=2;
PImage catPic;
void setup(){
  size(800,800);
  catPic=loadImage("cat.jpg");
  background(catPic);
}
void keyPressed() {
  x-=2*acceleration;
  y+=2*acceleration;


  if(x<0){
background(catPic);
x=265;
y=213; 
}
}
void draw(){
    if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
}
fill(#6D99F0);
noStroke();
ellipse(x,y,20,20);
ellipse(x+77,y-3,20,20);


}