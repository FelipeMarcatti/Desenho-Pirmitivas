package desenhoprimitivas;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
/**
 *
 * @author felipe marcatti
 */
public class DesenhoLinhas implements GLEventListener{
 
 @Override
 public void display(GLAutoDrawable drawable) {
  
  GL2 gl = drawable.getGL().getGL2();
  
  gl.glClear(GL.GL_COLOR_BUFFER_BIT);
  gl.glColor3f(1f, 1f, 1f);
  //LINHA 1
  gl.glLineWidth(5f);
  gl.glEnable(GL2.GL_LINE_STIPPLE);
  gl.glLineStipple(1, (short) 0xF0F0);
  gl.glBegin(GL.GL_LINES);
  gl.glVertex2i(0, 100);
  gl.glVertex2i(400, 50);
  gl.glEnd();
  gl.glDisable(GL2.GL_LINE_STIPPLE);
  
  //LINHA 2
  gl.glLineWidth(1f);
  gl.glEnable(GL2.GL_LINE_STIPPLE);
  gl.glLineStipple(1, (short) 0xAAAA);
  gl.glBegin(GL.GL_LINES);
  gl.glVertex2i(0, 150);
  gl.glVertex2i(400, 100);
  gl.glEnd();
  gl.glDisable(GL2.GL_LINE_STIPPLE);
  
  //LINHA 3
  gl.glLineWidth(4f);
  gl.glEnable(GL2.GL_LINE_STIPPLE);
  gl.glLineStipple(2,(short) 0xF0F0);
  gl.glBegin(GL.GL_LINES);
  gl.glVertex2i(0, 200);
  gl.glVertex2i(400, 150);
  gl.glEnd();
  gl.glDisable(GL2.GL_LINE_STIPPLE);
  
  //LINHA 4
  gl.glLineWidth(1f);
  gl.glEnable(GL2.GL_LINE_STIPPLE);
  gl.glLineStipple(2, (short) 0xF0F0);
  gl.glBegin(GL.GL_LINES);
  gl.glVertex2i(0, 250);
  gl.glVertex2i(400, 200);
  gl.glEnd();
  gl.glDisable(GL2.GL_LINE_STIPPLE);
  
  //LINHA 5
  gl.glEnable(GL2.GL_LINE_STIPPLE);
  gl.glLineStipple(2, (short) 0xF0F0);
  gl.glBegin(GL.GL_LINES);
  gl.glVertex2i(0, 300);
  gl.glVertex2i(400, 250);
  gl.glEnd();
  gl.glDisable(GL2.GL_LINE_STIPPLE);
  
  //LINHA 6
  gl.glLineWidth(4f);
  gl.glBegin(GL.GL_LINES);
  gl.glVertex2i(0, 350);
  gl.glVertex2i(400, 300);
  gl.glEnd();
  
  //LINHA 7
  gl.glLineWidth(1f);
  gl.glBegin(GL.GL_LINES);
  gl.glVertex2i(0, 400);
  gl.glVertex2i(400,350);
  gl.glEnd();

  gl.glFlush();
 }

 @Override
 public void dispose(GLAutoDrawable arg0) {
  // TODO Auto-generated method stub
  
 }

 @Override
 public void init(GLAutoDrawable drawable) {
  
  GL2 gl = drawable.getGL().getGL2();
  
  gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
  gl.glMatrixMode(GL2.GL_MATRIX_MODE);
  gl.glLoadIdentity();
  
  GLU glu = new GLU();
  glu.gluOrtho2D(0, 400f, 0f, 500f);
 }

 @Override
 public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
  // TODO Auto-generated method stub
  
 }
 
 public static void main(String[] args) {
 
    GLProfile profile = GLProfile.get(GLProfile.GL2);
    
    GLCapabilities caps = new GLCapabilities(profile);
    
    GLCanvas canvas = new GLCanvas(caps); 
    canvas.addGLEventListener(new DesenhoLinhas()); 
    
  JFrame frame = new JFrame("Linhas");
  frame.add(canvas);
  frame.setSize(400, 500);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  
 }   
}
