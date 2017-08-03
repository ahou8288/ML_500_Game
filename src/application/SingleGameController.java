package application;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SingleGameController {
	private Main main;
	
	//Card slots
	@FXML private ImageView n0,n1,n2,n3,n4,n5,n6,n7,n8,n9;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void loadElements() {
		List<ImageView> northImages = Arrays.asList(n0,n1);
		List<String> imageExtensions = Arrays.asList("1c","2c");
		String basePath = "images/";
		String filetype = ".png";
		for (int i=0;i<northImages.size();i++) {
	        File file = new File(basePath+imageExtensions.get(i)+filetype);
	        Image image = new Image(file.toURI().toString());
	        northImages.get(i).setImage(image);
		}
	}
}
