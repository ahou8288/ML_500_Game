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
	@FXML private ImageView north_0,north_1,north_2,north_3,north_4,north_5,north_6,north_7,north_8,north_9;
	@FXML private ImageView south_0,south_1,south_2,south_3,south_4,south_5,south_6,south_7,south_8,south_9;
	@FXML private ImageView west_0,west_1,west_2,west_3,west_4,west_5,west_6,west_7,west_8,west_9;
	@FXML private ImageView east_0,east_1,east_2,east_3,east_4,east_5,east_6,east_7,east_8,east_9;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void loadElements() {
		List<ImageView> northImages = Arrays.asList(north_0,north_1,north_2,north_3,north_4,north_5,north_6,north_7,north_8,north_9);
		List<ImageView> southImages = Arrays.asList(south_0,south_1,south_2,south_3,south_4,south_5,south_6,south_7,south_8,south_9);
		List<ImageView> eastImages = Arrays.asList(east_0,east_1,east_2,east_3,east_4,east_5,east_6,east_7,east_8,east_9);
		List<ImageView> westImages = Arrays.asList(west_0,west_1,west_2,west_3,west_4,west_5,west_6,west_7,west_8,west_9);
		
		List<String> northExtensions = Arrays.asList("1c","2c","3c","4c","5c","6c","7c","8c","9c","10c");
		loadSide(northImages,northExtensions);
		loadSide(southImages,northExtensions);
		loadSide(eastImages,northExtensions);
		loadSide(westImages,northExtensions);
	}
	
	public void loadSide(List<ImageView> images, List<String> extensions) {
		String basePath = "images/";
		String filetype = ".png";
		for (int i=0;i<images.size();i++) {
	        File file = new File(basePath+extensions.get(i)+filetype);
	        Image image = new Image(file.toURI().toString());
	        images.get(i).setImage(image);
		}
	}
}
