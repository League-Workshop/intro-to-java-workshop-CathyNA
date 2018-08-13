PImage mustache;
PImage friend;
void setup(){
friend=loadImage("jin.jpg");
size(800,600);
friend.resize(800,600);
mustache=loadImage("mustache.png");
}
void draw(){
background(friend);
  image(mustache,400,300);
}
  