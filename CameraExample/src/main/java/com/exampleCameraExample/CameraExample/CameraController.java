package com.exampleCameraExample.CameraExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exampleCameraExample.CameraExample.Camera;
 
@RestController
public class CameraController {

	List<Camera> camera = new ArrayList<Camera>();
	  {
		 camera.add(new Camera(1, "CPI", "IMG001"));
		 camera.add(new Camera(2, "SimpliSafe", "IMG002"));
		 camera.add(new Camera(3, "ADT", "IMG003"));
		 camera.add(new Camera(4, "Vivint", "IMG004"));
	  }
	 
	  @RequestMapping(value = "/getCameras")
	  public List<Camera> getCameras() {
	    return camera;
	  }
	 
	  @RequestMapping(value = "/getCamera/{id}")
	  public String getCamera(@PathVariable(value = "id") int id) {
	    return Integer.toString(((Camera) camera).getID());
	  }
	 
	  @RequestMapping(value = "/getCameraBySystem/{system}")
	  public List<Camera> getCameraBySystem(@PathVariable(value = "system") String system) {
	    System.out.println("Searching Camera in System : " + system);
	    List<Camera> camerasBySystem = camera.stream().filter(x -> x.getSystem().equalsIgnoreCase(system))
	        .collect(Collectors.toList());
	    System.out.println(camerasBySystem);
	    return camerasBySystem;
	  }
	 
	  @RequestMapping(value = "/getImageByName/{imageName}")
	  public List<Camera> getImageByName(@PathVariable(value = "imageName") String imageName) {
	    return camera.stream().filter(x -> x.getImageByName().equalsIgnoreCase(imageName)).collect(Collectors.toList());
	  }
	}
