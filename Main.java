import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
	{
		WordChecker w = new WordChecker();
		ArrayList<String> words = new ArrayList<String>();
		words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println((words));
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());
        ArrayList<String> wordss = new ArrayList<String>();
        wordss.add("to");
        wordss.add("too");
        wordss.add("stool");
        wordss.add("tools");
        WordChecker y = new WordChecker(wordss);
        System.out.println(y.isWordChain());
        ArrayList<String> catList = new ArrayList<String>();
        catList.add("catch");
        catList.add("bobcat");
        catList.add("catchacat");
        catList.add("cat");
        catList.add("at");
        WordChecker cats = new WordChecker(catList);
        System.out.println(cats.createList("cat"));
        System.out.println(cats.createList("catch"));
        System.out.println(cats.createList("dog"));
    }
    }
}