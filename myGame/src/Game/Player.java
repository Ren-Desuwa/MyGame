package Game;

import java.awt.*;
import java.awt.image.*;

public class Player extends GameObject {

	private Controller controller;
	
	public Player(Controller controller) {
		super();
		this.controller = controller;
	}
	int deltaX;
	int deltaY;
	
	
	@Override
	public void update() {
		
		
		
		if (controller.isRequestingUp()) {
			deltaY--;
		}
		if (controller.isRequestingDown()) {
			deltaY++;
		}
		if (controller.isRequestingLeft()) {
			deltaX--;
		}
		if (controller.isRequestingRight()) {
			deltaX++;
		}
		position = new Position(position.getX() + deltaX, position.getY() + deltaY);
		
	}

	@Override
	public Image getSprite() {
		
		BufferedImage image = new BufferedImage(size.getWidth(), size.getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics = image.createGraphics();
		
		graphics.setColor(Color.RED);
		graphics.fillRect(0, 0, size.getWidth(), size.getHeight());
		
		graphics.dispose();
		return image;
	}

}
