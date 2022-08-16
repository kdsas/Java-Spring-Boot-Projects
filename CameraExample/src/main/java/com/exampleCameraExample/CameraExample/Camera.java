package com.exampleCameraExample.CameraExample;

public class Camera {

	private int id;
	  private String system;
	  private String imageName;
	 
	  public Camera(int id, String system, String imageName) {
	    super();
	    this.id = id;
	    this.system = system;
	    this.imageName = imageName;
	  }
	 
	  public int getID() {
	    return id;
	  }
	 
	  public String getSystem() {
	    return system;
	  }
	 
	  public String getImageByName() {
	    return imageName;
	  }
	 
	  @Override
	  public String toString() {
	    return "Camera [id=" + id+ ", system=" + system + ", imageName=" + imageName + "]";
	  }
	}