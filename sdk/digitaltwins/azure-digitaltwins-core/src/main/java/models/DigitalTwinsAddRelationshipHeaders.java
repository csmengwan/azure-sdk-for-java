/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package digitaltwins.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for AddRelationship operation.
 */
public class DigitalTwinsAddRelationshipHeaders {
    /**
     * Weak Etag.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * Get weak Etag.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set weak Etag.
     *
     * @param eTag the eTag value to set
     * @return the DigitalTwinsAddRelationshipHeaders object itself.
     */
    public DigitalTwinsAddRelationshipHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
