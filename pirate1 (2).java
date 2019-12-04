import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PirateTranslator {
public static void main(String[] args) {
Scanner choice = new Scanner(System.in);
System.out.println("Do you want to translate text from file or input it by your own?
keyboard/file");
String ch = choice.next().toLowerCase();
if(ch.equals("keyboard")){
input();
}
else if(ch.equals("file")) {
System.out.println("Enter name of input file: ");
String in = choice.next();
System.out.println("Enter name of output file: ");
String out = choice.next();
file(in, out);
}
else
System.out.println("Invalid output. Closing program!");
choice.close();
}
/**
* method for input from keyboard
*/
public static void input(){
final Map<String, String> dic = create_dictionary();
Scanner scanner = new Scanner(System.in);
PrintWriter writer = new PrintWriter(System.out);


while (scanner.hasNext()) {
String token = scanner.next();
if(dic.containsKey(token)){
writer.print(dic.get(token) + " ");
}else if (token.endsWith(".")) {
writer.print(token + " Arrr.\n");
} else {
writer.print(token + " ");
}
writer.flush();
}


scanner.close();
writer.close();
}


/**
* method for input from file
* @param in - Input file
* @param out - Output file
* throws exceptions
* be careful entering name of input file
*/
public static void file(String in, String out){
final Map<String, String> dic = create_dictionary();
Scanner scanner = null;
try {
scanner = new Scanner(new File(in));


} catch (FileNotFoundException e) {
System.out.println("Such file doesn't exist! Closing program!");
System.exit(0);
}
PrintWriter writer = null;
try {
writer = new PrintWriter(new File(out));
} catch (FileNotFoundException e) {
System.out.println("Error! Closing program!");
System.exit(0);
}


while (scanner.hasNext()) {
String token = scanner.next();
if(dic.containsKey(token)){
writer.print(dic.get(token) + " ");
}else if (token.endsWith(".")) {
writer.print(token + " Arrr.\n");
} else {
writer.print(token + " ");
}
writer.flush();
}


scanner.close();
writer.close();
}


/**


* @return dictionary
*/
public static Map<String, String> create_dictionary(){
Map<String, String> dictionary = new HashMap<String, String>();
dictionary.put("hello", "ahoy");
dictionary.put("hi", "yo-ho-ho");
dictionary.put("hey", "avast");
dictionary.put("my", "me");
dictionary.put("friend", "me bucko");
dictionary.put("sir", "matey");
dictionary.put("madam", "proud beauty");
dictionary.put("stranger", "scurvy dog");
dictionary.put("officer", "foul blaggard");
dictionary.put("where", "whar");
dictionary.put("is", "be");
dictionary.put("are", "be");
dictionary.put("the", "th'");
dictionary.put("you", "ye");
dictionary.put("your", "yer");
dictionary.put("you're", "ye be");
dictionary.put("we're", "we be");
dictionary.put("old", "barnacle-covered");
dictionary.put("attractive", "comely");
dictionary.put("happy", "grog-filled");
dictionary.put("nearby", "broadside");
dictionary.put("restroom", "head");
dictionary.put("restaurant", "galley");
dictionary.put("hotel", "fleabag inn");
dictionary.put("bank", "buried treasure");
dictionary.put("yes", "aye");
dictionary.put("yes!", "aye aye!");
dictionary.put("addled", "mad");
dictionary.put("after", "aft");
dictionary.put("money", "booty");
dictionary.put("professor", "cap'n");
dictionary.put("food", "grub");
dictionary.put("of", "o'");
dictionary.put("quickly", "smartly");
dictionary.put("to", "t'");
dictionary.put("and", "an'");
dictionary.put("it's", "it be");
dictionary.put("right", "starboard");
dictionary.put("left", "port");


dictionary.put("hello.", "ahoy. Arrr.\n");
dictionary.put("hi.", "yo-ho-ho. Arrr.\n");
dictionary.put("hey.", "avast. Arrr.\n");
dictionary.put("my.", "me. Arrr.\n");
dictionary.put("friend.", "me bucko. Arrr.\n");
dictionary.put("sir.", "matey. Arrr.\n");
dictionary.put("madam.", "proud beauty. Arrr.\n");
dictionary.put("stranger.", "scurvy dog. Arrr.\n");
dictionary.put("officer.", "foul blaggard. Arrr.\n");
dictionary.put("where.", "whar. Arrr.\n");
dictionary.put("is.", "be. Arrr.\n");
dictionary.put("are.", "be. Arrr.\n");
dictionary.put("the.", "th'. Arrr.\n");
dictionary.put("you.", "ye. Arrr.\n");
dictionary.put("your.", "yer. Arrr.\n");
dictionary.put("you're.", "ye be. Arrr.\n");
dictionary.put("we're.", "we be. Arrr.\n");
dictionary.put("old.", "barnacle-covered. Arrr.\n");
dictionary.put("attractive.", "comely. Arrr.\n");
dictionary.put("happy.", "grog-filled. Arrr.\n");
dictionary.put("nearby.", "broadside. Arrr.\n");
dictionary.put("restroom.", "head. Arrr.\n");
dictionary.put("restaurant.", "galley. Arrr.\n");
dictionary.put("hotel.", "fleabag inn. Arrr.\n");
dictionary.put("bank.", "buried treasure. Arrr.\n");
dictionary.put("yes.", "aye. Arrr.\n");
dictionary.put("yes!", "aye aye!\n");
dictionary.put("addled.", "mad. Arrr.\n");
dictionary.put("after.", "aft. Arrr.\n");
dictionary.put("money.", "booty. Arrr.\n");
dictionary.put("professor.", "cap'n. Arrr.\n");
dictionary.put("food.", "grub. Arrr.\n");
dictionary.put("of.", "o'. Arrr.\n");
dictionary.put("quickly.", "smartly. Arrr.\n");
dictionary.put("to.", "t'. Arrr.\n");
dictionary.put("and.", "an'. Arrr.\n");
dictionary.put("it's.", "it be. Arrr.\n");
dictionary.put("right.", "starboard. Arrr.\n");
dictionary.put("left.", "port. Arrr.\n");
return dictionary;
}


}