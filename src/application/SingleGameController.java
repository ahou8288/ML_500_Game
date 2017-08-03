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
	@FXML private ImageView s0,s1,s2,s3,s4,s5,s6,s7,s8,s9;
	@FXML private ImageView w0,w1,w2,w3,w4,w5,w6,w7,w8,w9;
	@FXML private ImageView e0,e1,e2,e3,e4,e5,e6,e7,e8,e9;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void loadElements() {
		List<ImageView> northImages = Arrays.asList(n0,n1,n2,n3,n4,n5,n6,n7,n8,n9);
		List<ImageView> eastImages = Arrays.asList(e0,e1,e2,e3,e4,e5,e6,e7,e8,e9);
		List<ImageView> westImages = Arrays.asList(w0,w1,w2,w3,w4,w5,w6,w7,w8,w9);
		List<ImageView> southImages = Arrays.asList(s0,s1,s2,s3,s4,s5,s6,s7,s8,s9);
		
		List<String> northExtensions = Arrays.asList("1c","2c","3c","4c","5c","6c","7c","8c","9c","10c");
		loadSide(northImages,northExtensions,false);
		loadSide(southImages,northExtensions,false);
		loadSide(westImages,northExtensions,true);
		loadSide(eastImages,northExtensions,true);
	}
	
	public void loadSide(List<ImageView> images, List<String> extensions, boolean rotate) {
		String basePath = "images/";
		String filetype = ".png";
		for (int i=0;i<images.size();i++) {
	        File file = new File(basePath+extensions.get(i)+filetype);
	        Image image = new Image(file.toURI().toString());
	        images.get(i).setImage(image);
	        
	        if (rotate) images.get(i).setRotate(90);
		}
	}
}
