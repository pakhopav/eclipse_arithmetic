/**
 */
package emf.arithmetics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.arithmetics.Import#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see emf.arithmetics.ArithmeticsPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(emf.arithmetics.Module)
	 * @see emf.arithmetics.ArithmeticsPackage#getImport_Module()
	 * @model
	 * @generated
	 */
	emf.arithmetics.Module getModule();

	/**
	 * Sets the value of the '{@link emf.arithmetics.Import#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(emf.arithmetics.Module value);

} // Import
