import Engine.Window;
import org.lwjgl.opengl.GL;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;



public class Main {

    private Window window = new Window(800,800,"Hello World");

    public void init(){
        window.init();
        GL.createCapabilities();

        //code
    }
    public void loop(){
        while(window.isOpen()){
            window.update();
            glClearColor(0.0f,0.0f,0.0f,0.0f);
            GL.createCapabilities();
            //code

            //restore state
            glDisableVertexAttribArray(0);

            //poll for window events.
            //the key callback above will only be
            //invoked during this call.
            glfwPollEvents();

        }
    }
    public void run(){
        init();
        loop();

        // terminate GLFW and
        // free the error callback

        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        new Main().run();

    }
}

