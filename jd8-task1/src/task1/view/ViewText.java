package task1.view;

import task1.bean.Sentence;
import task1.bean.Text;
import task1.bean.Word;

public class ViewText {
	public void viewText(Text text) {

		for (Sentence x : text.getText()) {
			for (Word y : x.getSentence()) {
				System.out.println(y);
			}

		}
		System.out.println();
	}

	public void viewTitle(Text text) {

		System.out.println("Название текста: " + text.getTitle());

		System.out.println();
	}
}
