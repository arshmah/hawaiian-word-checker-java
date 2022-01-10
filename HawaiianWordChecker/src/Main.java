import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
NewJFrame1 frame = new NewJFrame1();
frame.setVisible(true);
Scanner sc = new Scanner(System.in);
String input, option;
do{
do{
System.out.print("Enter a hawaiian word to pronounce ==> ");
input = sc.nextLine();
}while (!isValid(input));
System.out.println(input.toUpperCase() + " is pronounced " + pronounce(input));
do{
System.out.print("Do you want to enter another word? Y/YES/N/NO ==> ");
option = sc.nextLine().toLowerCase();
if(!option.equals("y") && !option.equals("yes") && !option.equals("n") && !option.equals("no")) {
System.out.println("Enter Y, YES, N or NO");
}
}while(!option.equals("y") && !option.equals("yes") && !option.equals("n") && !option.equals("no"));
}while (option.equals("y") || option.equals("yes"));
}
public static boolean isValid(String input) {
char hawaiianCharacters[] = {'a', 'e', 'i', 'o', 'u', 'p', 'k', 'h', 'l', 'm', 'n', 'w', ' ', '\'' };
int flag = 0;
char ch;
input = input.toLowerCase();
for(int i = 0; i < input.length(); i ++) {
ch = input.charAt(i);
for(int j = 0; j < hawaiianCharacters.length; j ++) {
if(hawaiianCharacters[j] == ch) {
flag ++;
break;
}
}
if(flag == 0) {
System.out.println( input.toUpperCase().charAt(i) + " is not a valid hawaiian character");
return false;
}
flag = 0;
}
return true;
}
public static String pronounce(String input) {
String newString = "";
input = input.toLowerCase();
for (int i = 0; i < input.length(); i ++) {
char ch = input.charAt(i);
if(i == 0 && ch =='w') {
newString += "aw-";
}
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
if(ch == 'a') {
if(i < input.length() - 1){
char ch1 = input.charAt(i + 1);
if(ch1 == 'w') { newString += "aw"; i ++;}
else if(ch1 == 'i' || ch1 == 'e') { newString += "eye"; i ++;}
else if(ch1 == 'o'|| ch1 == 'u') { newString += "ow"; i ++;}
else{
newString += "ah";
}
}
else{
newString += "ah";
}
}
else if(ch == 'e') {
if(i < input.length() - 1){
char ch1 = input.charAt(i + 1);
if(ch1 == 'i') { newString += "ay"; i ++;}
else if(ch1 == 'u') { newString += "eh-oo"; i ++;}
else if(ch == 'w') { newString += "av"; i ++;}
else{
newString += "eh";
}
}
else{
newString += "eh";
}
}
else if(ch == 'i') {
if(i < input.length() - 1){
char ch1 = input.charAt(i + 1);
if(ch1 == 'u') { newString += "ew"; i ++;}
else if(ch == 'w') { newString += "av"; i ++;}
else{
newString += "ee";
}
}
else{
newString += "ee";
}
}
else if(ch == 'o') {
if(i < input.length() - 1){
char ch1 = input.charAt(i + 1);
if(ch1 == 'i') { newString += "oy"; i ++;}
else if(ch1 == 'u') { newString += "ow"; i ++;}
else if(ch == 'w') { newString += "aw"; i ++;}
else{
newString += "oh";
}
}
else{
newString += "oh";
}
}
else if(ch == 'u') {
if(i < input.length() - 1){
char ch1 = input.charAt(i + 1);
if(ch1 == 'i') { newString += "ooey"; i ++;}
else if(ch == 'w') { newString += "aw"; i ++;}
else{
newString += "oo";
}
}
else{
newString += "oo";
}
}
if(i != input.length() - 1){
char ch2 = 'a', ch3;
if(i != 0) ch2 = input.charAt(i - 1);
ch3 = input.charAt(i + 1);
if(ch2 != ' ' && ch3 != '\'' && ch3 != ' ')
{
newString += "-";
}
}
}
else {
newString += ch;
}
}
newString = newString.substring(0, 1).toUpperCase() + newString.substring(1);
return newString;
}

}
