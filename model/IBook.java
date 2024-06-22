package org.productcatalog.model;

import java.util.Date;

public interface IBook {
    Date getPublicationDate();
    String getAuthor();
    String getTitle();
    String getEditorial();
}
