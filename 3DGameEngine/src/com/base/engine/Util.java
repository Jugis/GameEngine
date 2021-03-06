/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;

/**
 *
 * @author PM
 */
public class Util {
    
    public static FloatBuffer createFloatBuffer(int size){
        int lofasz = 2;
        return BufferUtils.createFloatBuffer(size);
    }
    
    public static FloatBuffer createFlippedBuffer(Vertex[] vertices){
        FloatBuffer buffer = createFloatBuffer(vertices.length * Vertex.SIZE);
        
        for(int i=0; i< vertices.length;i++){
            buffer.put(vertices[i].getPos().getX());
            buffer.put(vertices[i].getPos().getY());
            buffer.put(vertices[i].getPos().getZ());            
        }
        
        buffer.flip();
        
        return buffer;
    }
}
