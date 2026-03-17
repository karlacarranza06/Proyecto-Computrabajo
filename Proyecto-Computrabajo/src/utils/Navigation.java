/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import Paneles.ITraceablePanel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import javax.swing.JPanel;
import proyecto.computrabajo.MainFrame;

/**
 *
 * @author josue
 */
public class Navigation {
    private javax.swing.JPanel mainPanel; 
    private final Deque<JPanel> navigationState = new ArrayDeque<>();
    private static Navigation instance;
    private javax.swing.JPanel currentPanel;
    private MainFrame mainFrame;
    private javax.swing.JLabel breadcrumbsLabel;
    
    public static Navigation getInstance() {
        if(instance == null) {
            instance = new Navigation();
        }
        
        return instance;
    }
    
    private Navigation() { }
    
    public void setBreadcrumbsLabel(javax.swing.JLabel breadcrumbsLabel) {
        this.breadcrumbsLabel = breadcrumbsLabel;
    }
    
    public void setMainPanel(javax.swing.JPanel panel) {
        mainPanel = panel;
    }
    
    public MainFrame getMainFrame() {
        return this.mainFrame;
    }
    
    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }
    
    public void reset(javax.swing.JPanel newPanel) {
        navigationState.clear();
        currentPanel = null;
        navigateTo(newPanel);
    }
    
    public void navigateTo(javax.swing.JPanel newPanel) {
        if (currentPanel != null) navigationState.push(currentPanel);

        currentPanel = newPanel;
        paintInMain(currentPanel);
    }
    
    public void navigateBack() {
        if(navigationState.isEmpty()) return;
        
        currentPanel = navigationState.pop();
        paintInMain(currentPanel);
    }
    
    public Deque<String> getBreadcrumbs() {
        Deque<String> breadcrumbs = new ArrayDeque();
        Iterator<JPanel> it = navigationState.iterator();
        
        if (currentPanel != null) {
            breadcrumbs.push(((ITraceablePanel) currentPanel).getTitle());
        }

        while(it.hasNext()) {
            ITraceablePanel current = (ITraceablePanel) it.next();
            breadcrumbs.push(current.getTitle());
        }
        
        return breadcrumbs;
    }
    
    public void paintBreadcrumbs() {
        breadcrumbsLabel.setText(String.join(" / ", getBreadcrumbs()));
    }
    
    private void paintInMain(javax.swing.JPanel panel) {
        Component center = ((BorderLayout) mainPanel.getLayout()).getLayoutComponent(BorderLayout.CENTER);
        
        if (center != null) {
            mainPanel.remove(center);
        }
        
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
        
        paintBreadcrumbs();
    }
}
