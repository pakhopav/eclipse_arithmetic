package org.xtext.arithmetic.tests;

import emf.arithmetics.ArithmeticsPackage;
import java.io.IOException;
import java.util.Map;
import javax.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.arithmetic.tests.ArithmeticInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(ArithmeticInjectorProvider.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private ParseHelper<emf.arithmetics.Module> parser;
  
  @Test
  public void testParser() {
    try {
      ArithmeticsPackage.eINSTANCE.eClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a");
      _builder.newLine();
      _builder.append("def B : 2/2;");
      _builder.newLine();
      final emf.arithmetics.Module model = this.parser.parse(_builder);
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      final Map<String, Object> m = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      m.put("calc", _xMIResourceFactoryImpl);
      final ResourceSetImpl resSet = new ResourceSetImpl();
      final Resource resource = resSet.createResource(URI.createFileURI("/Users/pavel/work/eclipse_arithmetic/org.xtext.arithmetic.tests/saved-models/test.calc"));
      resource.getContents().add(model);
      try {
        resource.save(null);
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLoad() {
    ArithmeticsPackage.eINSTANCE.eClass();
    final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    final Map<String, Object> m = reg.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    m.put("calc", _xMIResourceFactoryImpl);
    final ResourceSetImpl resSet = new ResourceSetImpl();
    final Resource resource = resSet.getResource(URI.createURI("test.calc"), true);
    final EObject myWeb = resource.getContents().get(0);
  }
}
