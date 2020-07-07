package org.xtext.arithmetic.tests


import org.junit.runner.RunWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.InjectWith
import emf.arithmetics.ArithmeticsPackage
import org.eclipse.xtext.testing.util.ParseHelper
import javax.inject.Inject
import emf.arithmetics.Module
import org.junit.Test
import org.eclipse.xtext.util.EmfFormatter

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import java.util.Collections
import java.io.IOException
import java.util.HashMap
import org.eclipse.emf.ecore.xmi.XMLResource
import java.io.FileWriter
import java.io.FileOutputStream
import java.io.File

@RunWith(XtextRunner)
@InjectWith(ArithmeticInjectorProvider)
class ParserTest {
	@Inject ParseHelper<Module> parser
	
	@Test 
	def void testParser(){
			ArithmeticsPackage.eINSTANCE.eClass()
		 val model = parser.parse('''
			module a
			def B : 2/2;
		 ''')
		  val reg = Resource.Factory.Registry.INSTANCE
		 val m = reg.getExtensionToFactoryMap()
		 m.put("calc", new XMIResourceFactoryImpl())
		 val resSet = new ResourceSetImpl()
		 
		 val resource = resSet.createResource(URI.createFileURI("/Users/pavel/work/eclipse_arithmetic/org.xtext.arithmetic.tests/saved-models/test.calc"))
        
        resource.getContents().add(model);	
        try {
            	resource.save(null);
          
        } catch (IOException e) {
       
            e.printStackTrace();
        }

	}
	
	@Test
	def void testLoad() {
   
        ArithmeticsPackage.eINSTANCE.eClass();

        val reg = Resource.Factory.Registry.INSTANCE;
        val m  = reg.getExtensionToFactoryMap();
        m.put("calc", new XMIResourceFactoryImpl());

        
        val resSet = new ResourceSetImpl();


        val resource = resSet.getResource(URI.createURI("test.calc"), true);
       
        val myWeb =  resource.getContents().get(0);
        
    }
}