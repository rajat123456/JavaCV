package FirstApp;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class FirstJavaCVApp {
    public static void main(String[] args){
    	
    	    //Loading the Native OpenCV Libraries
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            
           //Mat.eye represent Identity Matrix
           //Mat is class which represents n-dimentional multi-channel array used to store real or complex-valued matrices, grayscale or color images 
           //3X3 is dimension of matrix and "CV_8SC1" is type of its elements
           //CV_8SC1---> Matrix of size 3X3
           //CV_8SC2---> Matrix of size 3X6
           //CV_8SC3---> Matrix of size 3X9
           //CV_8SC4---> Matrix of size 3X12
            Mat mat = Mat.eye(3, 3, CvType.CV_8SC3);
            System.out.println("mat = " + mat.dump());
    }
}