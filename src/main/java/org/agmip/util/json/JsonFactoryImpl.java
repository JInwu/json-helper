/*
 * Copyright (c) 2013, AgMIP All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 *  Neither the name of the AgMIP nor the names of its
 *   contributors may be used to endorse or promote products derived from this
 *   software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.agmip.util.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;


/**
 * JsonFactoryImpl creates a single factory (singleton as single-element enum)
 * and allows creating of parsers and generators from this factory. This is
 * considered a best practice in Jackson.
 *
 * @author  Christopher Villalobos
 * @version 1.0
 * @since   1.0
 */
public enum JsonFactoryImpl {
    INSTANCE;

    /**
     * Static {@code JsonFactory} available for public consumption.
     */
    public static final JsonFactory jsonFactory = new JsonFactory();

    /**
     * Creates a parser for a {@code byte[]}.
     *
     * @param source
     * @return a {@code JsonParser} for {@code source}.
     * @throws IOException
     */
    public JsonParser getParser(byte[] source) throws IOException {
        return jsonFactory.createParser(source);
    }

    /**
     * Creates a parser for an {@link InputStream}.
     *
     * @param source
     * @return a {@code JsonParser} for {@code source}.
     * @throws IOException
     */
    public JsonParser getParser(InputStream source) throws IOException {
        return jsonFactory.createParser(source);
    }

    /**
     * Creates a generator into an {@link OutputStream}.
     *
     * @param dest
     * @return a {@code JsonGenerator} for {@code dest}.
     * @throws IOException
     */
    public JsonGenerator getGenerator(OutputStream dest) throws IOException {
        return jsonFactory.createGenerator(dest);
    }
}
