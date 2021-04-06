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
public class DesenhoPontos implements GLEventListener{
   
 @Override
 public void display(GLAutoDrawable drawable) {
  
  GL2 gl = drawable.getGL().getGL2();
  
  gl.glClear(GL.GL_COLOR_BUFFER_BIT);
  gl.glColor3f(1f, 0, 0);
  
//PONTOS EM LINHA COM ESCALAS DIFERENTES  
  gl.glPointSize(1f);
  gl.glBegin(GL2.GL_POINTS);
  gl.glVertex2i(100,50);
  gl.glEnd();
  
  gl.glPointSize(2f);
  gl.glBegin(GL2.GL_POINTS);
  gl.glVertex2i(120,50);
  gl.glEnd();
 
  gl.glPointSize(3f);
  gl.glBegin(GL2.GL_POINTS);
  gl.glVertex2i(140,50);
  gl.glEnd();
  
  gl.glPointSize(4f);
  gl.glBegin(GL2.GL_POINTS);
  gl.glVertex2i(160,50);
  gl.glEnd();
  
  gl.glPointSize(5f);
  gl.glBegin(GL2.GL_POINTS);
  gl.glVertex2i(180,50);
  gl.glEnd();
  
  gl.glPointSize(6f);
  gl.glBegin(GL2.GL_POINTS);
  gl.glVertex2i(200,50);
  gl.glEnd();
  
//PONTOS ALEATÓRIOS COM TAMANHO E COR DIFERENTES
  gl.glColor3f(1f, 1f, 0);
  gl.glPointSize(7f);
  gl.glBegin(GL2.GL_POINTS);
  gl.glVertex2i(150,200);
  gl.glEnd();
  
  gl.glColor3f(1f, 0, 1f);
  gl.glPointSize(3f);
  gl.glBegin(GL2.GL_POINTS);
  gl.glVertex2i(250,100);
  gl.glEnd();
  
  gl.glColor3f(1f, 1f, 1f);
  gl.glPointSize(10f);
  gl.glBegin(GL2.GL_POINTS);
  gl.glVertex2i(279,130);
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
  glu.gluOrtho2D(0, 300f, 0f, 300f);
  
 }

 @Override
 public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
  // TODO Auto-generated method stub
  
 }
 
 public static void main(String[] args) {
 
    GLProfile profile = GLProfile.get(GLProfile.GL2);
    
    GLCapabilities caps = new GLCapabilities(profile);
    
    GLCanvas canvas = new GLCanvas(caps); 
    canvas.addGLEventListener(new DesenhoPontos()); 
   
  JFrame frame = new JFrame("Pontos");
  
  frame.add(canvas);
  frame.setSize(300, 300);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  
 }   
    
}
