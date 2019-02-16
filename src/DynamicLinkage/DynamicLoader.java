/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicLinkage;

import eg.edu.alexu.csd.oop.game.World;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 *
 * @author ahmed
 */
public class DynamicLoader {

    String JarPath;

    public DynamicLoader() {

    }

    public World loadSquirtle() {

        try {
            File f = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\assignment3_4257_4005_4195_4092_4115_4283\\Project1.6\\Project1.6\\dist\\Squirtle.jar");
            System.out.println(f);

            URL path = f.toURI().toURL();
            URL[] paths = new URL[]{path};

            ClassLoader cl = new URLClassLoader(paths);
            Class cls = cl.loadClass("eg.edu.alexu.csd.oop.game.sample.world.Squirtle");

            Class <? extends World>aClass;
            ClassLoader classLoader =  Class.forName("eg.edu.alexu.csd.oop.game.sample.world.Squirtle").getClassLoader();
            aClass = (Class<? extends World>)classLoader.loadClass("eg.edu.alexu.csd.oop.game.sample.world.Squirtle");

            Class<?> clazz = Class.forName("eg.edu.alexu.csd.oop.game.sample.world.Squirtle");
            Constructor<?> constructor = clazz.getConstructor();
            Object result = constructor.newInstance();

            
//            
//            URLClassLoader child = new URLClassLoader(paths, this.getClass().getClassLoader());
//            Class<? extends World> classToLoad = (Class<? extends World>) Class.forName("Squirtle", true, child);
//            Constructor construct = classToLoad.getConstructor(new Class[]{});
//            //Method method = classToLoad.getDeclaredMethod("getInstance", new Class[]{});
//            //Object instance = construct.newInstance();
//            Object instance = classToLoad.newInstance();
           World world = (World) result;
//            
            return world;

            //  return world;
        } catch (Exception e) {
            return null;

        }

    }

}
