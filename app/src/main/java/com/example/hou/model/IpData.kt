package com.example.hou.model

/**
 * Created by hou on 2018/9/19.
 */
class IpData  {

   private var country_id: String? = null
   private var area: String? = null
   private var area_id: String? = null
   private var region: String? = null
   private var region_id: String? = null
   private var city: String? = null
   private var city_id: String? = null
   private var isp: String? = null
   private var isp_id: String? = null
   private var ip: String? = null

   fun getCountry_id(): String? {
      return country_id
   }

   fun setCountry_id(country_id: String) {
      this.country_id = country_id
   }

   fun getArea(): String? {
      return area
   }

   fun setArea(area: String) {
      this.area = area
   }

   fun getArea_id(): String? {
      return area_id
   }

   fun setArea_id(area_id: String) {
      this.area_id = area_id
   }

   fun getRegion(): String? {
      return region
   }

   fun setRegion(region: String) {
      this.region = region
   }

   fun getRegion_id(): String? {
      return region_id
   }

   fun setRegion_id(region_id: String) {
      this.region_id = region_id
   }

   fun getCity(): String? {
      return city
   }

   fun setCity(city: String) {
      this.city = city
   }

   fun getCity_id(): String? {
      return city_id
   }

   fun setCity_id(city_id: String) {
      this.city_id = city_id
   }

   fun getIsp(): String? {
      return isp
   }

   fun setIsp(isp: String) {
      this.isp = isp
   }

   fun getIsp_id(): String? {
      return isp_id
   }

   fun setIsp_id(isp_id: String) {
      this.isp_id = isp_id
   }

   fun getIp(): String? {
      return ip
   }

   fun setIp(ip: String) {
      this.ip = ip
   }


}