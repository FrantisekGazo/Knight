package eu.inloop.knight.util;

import javax.lang.model.element.Element;

import eu.inloop.knight.ErrorMsg;

/**
 * Class {@link ProcessorError}
 *
 * @author FrantisekGazo
 * @version 2015-10-15
 */
public class ProcessorError extends Exception {

    private final Element mElement;

    public ProcessorError(Element e, ErrorMsg msg, Object... args) {
        super(String.format(msg.toString(), args));
        mElement = e;
    }

    public Element getmElement() {
        return mElement;
    }
}
