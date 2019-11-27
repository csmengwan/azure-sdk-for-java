/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the create Advanced Schedule.
 */
public class AdvancedSchedule {
    /**
     * Days of the week that the job should execute on.
     */
    @JsonProperty(value = "weekDays")
    private List<String> weekDays;

    /**
     * Days of the month that the job should execute on. Must be between 1 and
     * 31.
     */
    @JsonProperty(value = "monthDays")
    private List<Integer> monthDays;

    /**
     * Occurrences of days within a month.
     */
    @JsonProperty(value = "monthlyOccurrences")
    private List<AdvancedScheduleMonthlyOccurrence> monthlyOccurrences;

    /**
     * Get days of the week that the job should execute on.
     *
     * @return the weekDays value
     */
    public List<String> weekDays() {
        return this.weekDays;
    }

    /**
     * Set days of the week that the job should execute on.
     *
     * @param weekDays the weekDays value to set
     * @return the AdvancedSchedule object itself.
     */
    public AdvancedSchedule withWeekDays(List<String> weekDays) {
        this.weekDays = weekDays;
        return this;
    }

    /**
     * Get days of the month that the job should execute on. Must be between 1 and 31.
     *
     * @return the monthDays value
     */
    public List<Integer> monthDays() {
        return this.monthDays;
    }

    /**
     * Set days of the month that the job should execute on. Must be between 1 and 31.
     *
     * @param monthDays the monthDays value to set
     * @return the AdvancedSchedule object itself.
     */
    public AdvancedSchedule withMonthDays(List<Integer> monthDays) {
        this.monthDays = monthDays;
        return this;
    }

    /**
     * Get occurrences of days within a month.
     *
     * @return the monthlyOccurrences value
     */
    public List<AdvancedScheduleMonthlyOccurrence> monthlyOccurrences() {
        return this.monthlyOccurrences;
    }

    /**
     * Set occurrences of days within a month.
     *
     * @param monthlyOccurrences the monthlyOccurrences value to set
     * @return the AdvancedSchedule object itself.
     */
    public AdvancedSchedule withMonthlyOccurrences(List<AdvancedScheduleMonthlyOccurrence> monthlyOccurrences) {
        this.monthlyOccurrences = monthlyOccurrences;
        return this;
    }

}