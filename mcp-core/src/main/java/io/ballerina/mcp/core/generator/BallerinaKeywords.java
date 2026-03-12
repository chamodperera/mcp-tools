/*
 * Copyright (c) 2026, WSO2 LLC. (http://www.wso2.com)
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerina.mcp.core.generator;

import java.util.Set;

/**
 * Ballerina reserved keywords used to sanitize generated identifiers.
 * Matches the keyword list used in the reference generation script.
 */
public final class BallerinaKeywords {

    private BallerinaKeywords() {
        // utility class
    }

    /**
     * Complete set of Ballerina reserved keywords and built-in type names.
     */
    public static final Set<String> KEYWORDS = Set.of(
            "annotation", "any", "anydata",
            "boolean", "break", "byte",
            "check", "checkpanic", "class", "client", "configurable", "const", "continue",
            "decimal", "do",
            "else", "enum", "error", "external",
            "fail", "false", "final", "float", "flush", "fork", "from", "function", "future",
            "handle", "if", "import", "in", "int", "is", "isolated",
            "json",
            "let", "lock",
            "map", "match",
            "never", "new",
            "object", "on",
            "panic", "private", "public",
            "readonly", "resource", "retry", "return", "returns", "rollback",
            "service", "start", "stream", "string",
            "table", "transaction", "transactional", "trap", "true", "type", "typedesc",
            "as",
            "var",
            "wait", "while", "worker",
            "xml"
    );
}
