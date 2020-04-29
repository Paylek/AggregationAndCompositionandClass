package task1.main;

import java.util.ArrayList;
import java.util.List;

import task1.bean.Sentence;
import task1.bean.Text;
import task1.bean.Word;
import task1.logic.TextLogic;
import task1.view.ViewText;

public class DemoText {
public static void main(String[] args) {
		
		ViewText view = new ViewText(); 
		TextLogic logic = new TextLogic();
		
		
		Word words = new Word("Создать класс типа Текст ");
		Word words1 = new Word("используя класс Слово ");
		Word words2 = new Word("и класс предложение ");
		Word words3 = new Word("Создать методы: ");
		
		Word words4 = new Word("дополнить текст ");
		Word words5 = new Word("вывести на консоль текст ");
		Word words6 = new Word("вывести название текста  ");
		
		
		List<Word> listWords = new ArrayList<Word>();
		List<Word> listWords2 = new ArrayList<Word>();
		
		listWords.add(words);
		listWords.add(words1);
		listWords.add(words2);
		listWords.add(words3);
		
		listWords2.add(words4);
		listWords2.add(words5);
		listWords2.add(words6);
		
		
		Sentence sentence1 = new Sentence(listWords);
		Sentence sentence2 = new Sentence(listWords2);
		
		List<Sentence> text = new ArrayList<Sentence>();
		
		text.add(sentence1);
		text.add(sentence2);
		
		Text textdemo = new Text("Demo", text);
		
		view.viewText(textdemo);
		view.viewTitle(textdemo);
		
		logic.increaseText(textdemo,"Привет Java" );
		
		view.viewText(textdemo);
		

	}
}
