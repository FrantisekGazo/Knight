package eu.inloop.knight.util;

/**
 * Interface {@link IImports}
 *
 * @author FrantisekGazo
 * @version 2015-11-20
 */
public interface IImports {

    /**
     * Imports given classes.
     *
     * @param classes Supported are FQN String, Class object and JavaFileObject.
     */
    IBody imports(Object... classes);

}

