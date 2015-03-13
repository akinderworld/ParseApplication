package dataaccess;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.util.Date;

/**
 * Created by Android on 3/13/2015.
 */
@ParseClassName("FoodItem")
public class FoodItem extends ParseObject {

    String name,type;
    Date addedDate,expiryDate;
    int daysBeforeExpiry;
    String foodImagePath;

    public String getName() {
        return getString("name");
    }

    public void setName(String name) {
        put("name",name);
    }

    public String getType() {
        return getString("type");
    }

    public void setType(String type) {
        put("type",type);
    }

    public Date getAddedDate() {
        return getDate("addedDate");
    }

    public void setAddedDate(Date addedDate) {
        put("addedDate",addedDate);
    }

    public Date getExpiryDate() {
        return getDate("expiryDate");
    }

    public void setExpiryDate(Date expiryDate) {
        put("expiryDate",expiryDate);
    }

    public int getDaysBeforeExpiry() {
        return getInt("daysBeforeExpiry");
    }

    public void setDaysBeforeExpiry(int daysBeforeExpiry) {
        put("daysBeforeExpiry",daysBeforeExpiry);
    }

    public String getFoodImagePath() {
        return getString("foodImagePath");
    }

    public void setFoodImagePath(String foodImagePath) {
        put("foodImagePath",foodImagePath);
    }
}
