/**
 */
package emf.arithmetics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.arithmetics.Definition#getArgs <em>Args</em>}</li>
 *   <li>{@link emf.arithmetics.Definition#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see emf.arithmetics.ArithmeticsPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends Statement, AbstractDefinition {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link emf.arithmetics.DeclaredParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see emf.arithmetics.ArithmeticsPackage#getDefinition_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclaredParameter> getArgs();

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see emf.arithmetics.ArithmeticsPackage#getDefinition_Expr()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link emf.arithmetics.Definition#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // Definition
