/*
 * Copyright 2004-2005 Graeme Rocher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package grails.exceptions;

import grails.exceptions.GrailsException;

/**
 * Generic global runtime exception.
 *
 * @author Graeme Rocher
 * @since 0.4
 */
public class GrailsRuntimeException extends GrailsException {

    private static final long serialVersionUID = -1335036736215845295L;

    public GrailsRuntimeException(String message) {
        super(message);
    }

    public GrailsRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public GrailsRuntimeException(Throwable cause) {
        super(cause);
    }
}