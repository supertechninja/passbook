package com.mcwilliams.passbook.models;

import com.mcwilliams.passbook.models.storecard.AuxiliaryFieldsEntity;
import com.mcwilliams.passbook.models.storecard.BackFieldsEntity;
import com.mcwilliams.passbook.models.storecard.HeaderFieldsEntity;

import java.util.List;

/**
 * Created by jrclark on 7/13/15.
 */
public class StoreCardEntity {
        private List<BackFieldsEntity> backFields;
        private List<AuxiliaryFieldsEntity> auxiliaryFields;
        private List<HeaderFieldsEntity> headerFields;

        public void setBackFields(List<BackFieldsEntity> backFields) {
            this.backFields = backFields;
        }

        public void setAuxiliaryFields(List<AuxiliaryFieldsEntity> auxiliaryFields) {
            this.auxiliaryFields = auxiliaryFields;
        }

        public void setHeaderFields(List<HeaderFieldsEntity> headerFields) {
            this.headerFields = headerFields;
        }

        public List<BackFieldsEntity> getBackFields() {
            return backFields;
        }

        public List<AuxiliaryFieldsEntity> getAuxiliaryFields() {
            return auxiliaryFields;
        }

        public List<HeaderFieldsEntity> getHeaderFields() {
            return headerFields;
        }
}
