package jdregistry.client.http

/**
 * Represents the response of a Http Request as performed by [IHttpGetClient].
 *
 * @author Lukas Zimmermann
 * @see IHttpGetClient
 * @since 0.0.1
 *
 */
interface IHttpResponse {

    /**
     * The HTTP statusCode code, represented as [Int].
     */
    val statusCode: Int

    /**
     * The body of the HTTP response, represented as [String].
     */
    val body: String

    /**
     * The value of the www-authenticate header, if present
     */
    val authenticate: List<String>?
}
