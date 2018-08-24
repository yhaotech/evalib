package tech.yhao.evalib.core.model;

import java.util.Date;
import java.util.UUID;

public class Permission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.t_permission.id
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    private UUID id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.t_permission.name
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.t_permission.description
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.t_permission.created_at
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.t_permission.updated_at
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.t_permission.id
     *
     * @return the value of public.t_permission.id
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    public UUID getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.t_permission.id
     *
     * @param id the value for public.t_permission.id
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.t_permission.name
     *
     * @return the value of public.t_permission.name
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.t_permission.name
     *
     * @param name the value for public.t_permission.name
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.t_permission.description
     *
     * @return the value of public.t_permission.description
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.t_permission.description
     *
     * @param description the value for public.t_permission.description
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.t_permission.created_at
     *
     * @return the value of public.t_permission.created_at
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.t_permission.created_at
     *
     * @param createdAt the value for public.t_permission.created_at
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.t_permission.updated_at
     *
     * @return the value of public.t_permission.updated_at
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.t_permission.updated_at
     *
     * @param updatedAt the value for public.t_permission.updated_at
     *
     * @mbg.generated Wed Aug 22 13:45:02 CST 2018
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}