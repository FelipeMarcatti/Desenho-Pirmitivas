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
public class DesenhoPoligono implements GLEventListener{
   
 @Override
 public void display(GLAutoDrawable drawable) {
  
  GL2 gl = drawable.getGL().getGL2();
  
  gl.glClear(GL.GL_COLOR_BUFFER_BIT);
  gl.glColor3f(1f, 1f, 1f);
  
 //---------BANDEIRA DE MINAS----------// 
  gl.glBegin(GL2.GL_QUAD_STRIP);
  gl.glVertex2i(50,100);
  gl.glVertex2i(50,400);
  gl.glVertex2i(450,100);
  gl.glVertex2i(450,400);
  gl.glVertex2i(650,100);
  gl.glVertex2i(650,400);
  gl.glEnd();
  
  gl.glColor3f(1f, 0, 0);
  gl.glBegin(GL.GL_TRIANGLES);
  gl.glVertex2f(250, 175);
  gl.glVertex2f(350, 350);
  gl.glVertex2f(450, 175);
  gl.glEnd();

//------------CASA--------------------//
  //QUADRADO PORTA
  gl.glColor3f(1f, 1f, 1f);
  gl.glLineWidth(1f);
  gl.glBegin(GL.GL_LINE_LOOP);
  gl.glVertex2f(300,550);
  gl.glVertex2f(300,1000);
  gl.glVertex2f(700,1000);
  gl.glVertex2f(700,550);
  gl.glEnd();
  //PORTA
  gl.glBegin(GL2.GL_QUAD_STRIP);
  gl.glVertex2f(575,550);
  gl.glVertex2f(425,550);
  gl.glVertex2f(575,700);
  gl.glVertex2f(425,700);
  gl.glVertex2f(575,900);
  gl.glVertex2f(425,900);
  gl.glEnd();
  //TELHADO 1
  gl.glLineWidth(5f); 
  gl.glBegin(GL.GL_LINE_LOOP);
  gl.glVertex2f(275,1000);
  gl.glVertex2f(500,1250);
  gl.glVertex2f(725,1000);
  gl.glEnd();
  
  //TELHADO 2
  gl.glBegin(GL.GL_TRIANGLE_STRIP);
  gl.glVertex2f(510,1240);
  gl.glVertex2f(725,1000);
  gl.glVertex2f(850,1315);  
  gl.glVertex2f(950,1040);
  gl.glVertex2f(1100,1370);
  gl.glVertex2f(1250,1100);
  gl.glEnd();
  
  //PAREDE JANELA
  gl.glLineWidth(1f);
  gl.glBegin(GL.GL_LINE_LOOP);
  gl.glVertex2f(700,550);
  gl.glVertex2f(1250,600);
  gl.glVertex2f(1240,1110);
  gl.glVertex2f(700,1000);
  gl.glEnd();
  
  //JANELA
  gl.glBegin(GL.GL_TRIANGLE_STRIP);
  gl.glVertex2f(850,900);
  gl.glVertex2f(850,750);
  gl.glVertex2f(1000,927);  
  gl.glVertex2f(1050,790);
  gl.glVertex2f(1150,960);
  gl.glVertex2f(1150,810);
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
  glu.gluOrtho2D(0, 1500f, 0f, 1500f);
  
 }

 @Override
 public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
  // TODO Auto-generated method stub
  
 }
 
 public static void main(String[] args) {
  
 
    GLProfile profile = GLProfile.get(GLProfile.GL2);
    GLCapabilities caps = new GLCapabilities(profile);
    GLCanvas canvas = new GLCanvas(caps); 
    canvas.addGLEventListener(new DesenhoPoligono()); 
  JFrame frame = new JFrame("Bandeira de Minas");
  frame.add(canvas);
  frame.setSize(1500, 1500);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  
 }   
    
}
